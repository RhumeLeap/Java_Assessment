package io.turntabl.machine;

public abstract class VirtualMachine {

    private String hostname;
    private String requestorName;
    private long numberOfCPU;
    private int sizeOfRAM;
    private int sizeOfHardDisk;
    private static int MAXIMUM_VM_BUILT_DAILY = 999;

    public VirtualMachine(String hostname, String requestorName) {
        if (!checkHostnameFormat(hostname)) {
            throw new WrongHostnameException("Hostname must be formated like 'host<date><build_ref_no>");
        }
        this.hostname = hostname;
        this.requestorName = requestorName;
    }

    private boolean checkHostnameFormat(String name) {
        String prefix = "host";
        String date = name.substring(4,12);
        String buildRequestNum = name.substring(12);

        // TODO: Check that date and request number are all numbers.

        if (name.startsWith(prefix)) {
            return true;
        }
        return false;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getRequestorName() {
        return requestorName;
    }

    public void setRequestorName(String requestorName) {
        this.requestorName = requestorName;
    }

    public long getNumberOfCPU() {
        return numberOfCPU;
    }

    public void setNumberOfCPU(long numberOfCPU) {
        this.numberOfCPU = numberOfCPU;
    }

    public int getSizeOfRAM() {
        return sizeOfRAM;
    }

    public void setSizeOfRAM(int sizeOfRAM) {
        this.sizeOfRAM = sizeOfRAM;
    }

    public int getSizeOfHardDisk() {
        return sizeOfHardDisk;
    }

    public void setSizeOfHardDisk(int sizeOfHardDisk) {
        this.sizeOfHardDisk = sizeOfHardDisk;
    }

    public static int getMaximumVmBuiltDaily() {
        return MAXIMUM_VM_BUILT_DAILY;
    }

    @Override
    public String toString() {
        return "VirtualMachine{ " + "hostname='" + hostname +
                ", requestorName='" + requestorName + '}';
    }
}
