package SouthPoint.conf.factory;

import SouthPoint.Domain.Report;

import java.util.Date;

/**
 * Created by student on 2015/10/17.
 */
public class ReportFactory {

    public static Report createReport(String referenceCode, String description, Date incidentDate, String studentNumber){
        Report report = new Report
                .Builder(referenceCode)
                .description(description)
                .incidentDate(incidentDate)
                .studentNumber(studentNumber)
                .build();
        return report;
    }
}
