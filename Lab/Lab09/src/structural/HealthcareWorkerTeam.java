package structural;

import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {

    private Set<HealthcareServiceable> members;

    public HealthcareWorkerTeam() {
        members = new LinkedHashSet<HealthcareServiceable>();
    }

    void addMember(HealthcareServiceable member) {
        members.add(member);
    }

    void removeMember(HealthcareWorker member) {
        members.remove(member);
    }

    public double getPrice() {
        double total = 0;
        for (HealthcareServiceable member : members) {
            total += member.getPrice();
        }
        return total;
    }

    public void service() {
        for (HealthcareServiceable member : members) {
            member.service();
        }
    }


}