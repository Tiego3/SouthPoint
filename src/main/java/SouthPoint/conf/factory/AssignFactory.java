package SouthPoint.conf.factory;

import SouthPoint.Domain.Assign;

/**
 * Created by student on 2015/10/17.
 */
public class AssignFactory {

    public static Assign createAssign(String roomNumber, String studentNumber){
        Assign assign = new Assign
                .Builder(roomNumber)
                .studentNumber(studentNumber)
                .build();
        return assign;
    }
}
