package io.turntabl.machine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesktopVMTest {

    private DesktopVM desktop;

    @Test
    public void testHostnameLength() {
        desktop = new DesktopVM("host20230405003", "Barry", "11", "21H2");
        int hostnameLength = desktop.getHostname().length();
        Assertions.assertEquals(hostnameLength, 15);
    }

    @Test
    public void testWrongHostnameFormat() {
        desktop = new DesktopVM("host20230405003", "Barry", "11", "21H2");
        Assertions.assertThrows(WrongHostnameException.class, () ->
                new WrongHostnameException("Hostname must be formatted like 'host<date><build_ref_no>"));
    }

    @Test
    public void testCorrectHostnameFormat() {
        desktop = new DesktopVM("host20230405003", "Barry", "11", "21H2");
        Assertions.assertEquals(desktop.getHostname(), "host20230405003");
    }

    @Test
    public void testNotNullHostname() {
        desktop = new DesktopVM("host20230405003", "Barry", "11", "21H2");
        Assertions.assertNotNull(desktop.getHostname());
    }

    @Test
    public void testNotNullRequestorName() {
        desktop = new DesktopVM("host20230405003", "Barry", "11", "21H2");
        Assertions.assertNotNull(desktop.getRequestorName());
    }

    @Test
    public void testNullRequestorName() {
        desktop = new DesktopVM("host20230405003", null, "11", "21H2");
        Assertions.assertThrows(NullPointerException.class, () ->
                new WrongHostnameException("Hostname must be formatted like 'host<date><build_ref_no>").getMessage());
    }

}
