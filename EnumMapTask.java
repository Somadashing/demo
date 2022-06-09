package org.collect;

import java.util.Date;
import java.util.EnumMap;
import java.util.Map.Entry;

 
class  Project{
	String prjName;
	String prjLead;
	Date prjStartDate;
	public Project(String prjName, String prjLead, Date prjStartDate) {
		this.prjName = prjName;
		this.prjLead = prjLead;
		this.prjStartDate = prjStartDate;
	}
	@Override
	public String toString() {
		return "Project [prjName=" + prjName + ", prjLead=" + prjLead + ", prjStartDate=" + prjStartDate + "]";
	}
	
}
public class EnumMapTask {
    enum Status {
        ACTIVE, DISABLED, COMPLETED;
    }

    public static void main(final String[] args) {
        EnumMap<Status, Project> enumMap = new EnumMap<>(Status.class);
        Project p1 = new Project("SBI Porject", "Mr. Simon Dube", new Date());
        Project p2 = new Project("Facebook App Porject", "Mrr. Simun Roy", new Date());
        Project p3 = new Project("AWS Porject", "Mr. Rocky Singh", new Date());
        
        enumMap.put(Status.ACTIVE, p1);
        enumMap.put(Status.DISABLED, p2);
        enumMap.put(Status.COMPLETED, p3);
        
        for(Entry<Status, Project> entry : enumMap.entrySet()){
            System.out.print(" Key -> " + entry.getKey());
            System.out.println(", Value - >" + entry.getValue());
        }
    }
}
