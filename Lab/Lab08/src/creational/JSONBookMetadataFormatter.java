package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
	
	private JSONObject jsonObj;
	private JSONArray jsonList;
	
    @Override
    public BookMetadataFormatter reset() {
    	jsonObj = new JSONObject();
        jsonList = new JSONArray();
        jsonObj.put(Book.class.getSimpleName() + 's' , jsonList);
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
    	JSONObject book = new JSONObject();
        JSONArray authors = new JSONArray();
        
        book.put("ISBN",b.getISBN());
        book.put("Title",b.getTitle());
        book.put("Publisher",b.getPublisher());
        for (String author : b.getAuthors()) {
            authors.add(author);
        }
        book.put("Authers", authors);
        jsonList.add(book);
        return this;
    }

    @Override
    public String getMetadataString() {
    	return jsonObj.toString();
    }
}
