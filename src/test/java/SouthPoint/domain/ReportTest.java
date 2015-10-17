package SouthPoint.domain;

import SouthPoint.Domain.Report;
import SouthPoint.conf.factory.ReportFactory;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by student on 2015/10/17.
 */
public class ReportTest {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Date date1 = new Date(10/10/2015);

    @Test
    public void testCreate() throws Exception {
        Report report = ReportFactory
                .createReport("213037041", "Tee",  date1 , "Female");
        Assert.assertEquals("213037041", report.getReferenceCode());
    }

    @Test
    public void testUpdate() throws Exception {
        Report report = new Report.Builder("213037041")
                .studentNumber("Tee")
                .id(new Long(3))
                .build();
        Report newreport = new Report
                .Builder(report.getReferenceCode())
                .copy(report)
                .studentNumber("Tiego").build();

        Assert.assertEquals("Tiego",newreport.getStudentNumber());
        Assert.assertEquals("213037041",newreport.getReferenceCode());
        Assert.assertEquals("213037041",report.getReferenceCode());

    }
}
