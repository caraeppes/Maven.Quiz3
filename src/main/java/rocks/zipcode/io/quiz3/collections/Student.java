package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    Map<Lab, LabStatus> map;

    public Student() {
        this(new TreeMap<>());
    }

    public Student(Map<Lab, LabStatus> map) {
        this.map = map;
    }

    public Lab getLab(String labName) {
        for(Lab lab : map.keySet()){
            if(lab.getName().equals(labName)){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) throws UnsupportedOperationException {
        if(getLab(labName) == null){
            throw new UnsupportedOperationException("Must fork lab before setting lab status!");
        }
        map.put(getLab(labName), labStatus);
    }


    public void forkLab(Lab lab) {
        map.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        return map.get(getLab(labName));
    }

    public String toString(){
        String studentString = "";
        for(Map.Entry entry : map.entrySet()){
            studentString += entry.getKey().toString() + " > " + entry.getValue() + "\n";
        }
        return studentString.substring(0, studentString.length() - 1);
    }
}
