package familytree.model.FamilyTree;


import familytree.model.Person.Person;

import java.util.List;


public interface TreeNode <T>{

    int getAge();
//    List<T> getPeople();
    void setFatherFirstName(String fatherFirstName);
    void setFatherLastName(String fatherLastName);
    void setMotherFirstName(String motherFirstName);
    void setMotherLastName(String motherLastName);
    void setBirthday(String dateBirthday);
    String getFatherFirstName();
    String getMotherLastName();
    String getMotherFirstName();
    String getFatherLastName();
    String getFirstName();
    void setFirstName(String firstName);
    String getLastName();
    void setLastName(String lastName);








}
