package Java;

import baseAPI.Base;
import org.junit.Test;

import java.util.List;

public class TableCell extends Base {

    @Test
    public void getCellValue()throws InterruptedException{
        String customerName = getTextByCss("tbody tr:nth-child(2) td:nth-child(2)");
        String country = getTextByCss("tbody tr:nth-child(2) td:nth-child(7)");
        System.out.println(customerName +" : " + country);
        sleepFor(2);
        List<String> list = getListOfTextByCss("tbody");
        displayText(list);
    }

}
