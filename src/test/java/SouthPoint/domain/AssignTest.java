package SouthPoint.domain;

import SouthPoint.Domain.Assign;
import SouthPoint.conf.factory.AssignFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/10/17.
 */
public class AssignTest {

    @Test
    public void testCreate() throws Exception {
        Assign assign = AssignFactory
                .createAssign("B18", "213037041");
        Assert.assertEquals("B18", assign.getRoomNumber());
    }

    @Test
    public void testUpdate() throws Exception {
        Assign assign = new Assign.Builder("B18")
                .studentNumber("213037041")
                .id(new Long(3))
                .build();
        Assign newassign = new Assign
                .Builder(assign.getRoomNumber())
                .copy(assign)
                .studentNumber("213037045").build();

        Assert.assertEquals("213037045",newassign.getStudentNumber());
        Assert.assertEquals("B18",newassign.getRoomNumber());
        Assert.assertEquals("B18",assign.getRoomNumber());

    }

}
