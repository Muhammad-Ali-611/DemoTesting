package Amazon;

import HomeFeature.AmazonBase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Search extends AmazonBase {

    @Test
    public void searchItems()throws InterruptedException{
        setItems(AmazonBase.list);
        getItems();
        List<String> listMenu = searchDropDownMenu("#searchDropdownBox option");
        Assert.assertEquals(listMenu,AmazonBase.menu);
        displayText(listMenu);
        for(String item: listMenu){
            typeAndEnterByCss("#twotabsearchtextbox", item);
            sleepFor(4);
        }
    }
}
