package io.turntabl.machine;

public abstract class VirtualMachine {

    private String hostname;
    private String requestorName;
    protected long numberOfCPU;
    protected int sizeOfRAM;
    protected int sizeOfHardDisk;

    private static final int MAXIMUM_VM_BUILT_DAILY = 999;

    public VirtualMachine(String hostname, String requestorName) {
        if (hostname == null || requestorName == null) {
            throw new NullPointerException("Hostname and requestor name cannot be null");
        }
        if (!checkHostnameFormat(hostname)) {
            throw new WrongHostnameException("Hostname must be formatted like 'host<date><build_ref_no>");
        }
        this.hostname = hostname;
        this.requestorName = requestorName;
    }

    private boolean checkHostnameFormat(String name) {
        int defaultHostnameLength = 15;
        if (name.isEmpty() || name.length() < defaultHostnameLength) {
            return false;
        }
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

    public abstract long getNumberOfCPU();

    public abstract void setNumberOfCPU(long numberOfCPU);

    public abstract int getSizeOfRAM();

    public abstract void setSizeOfRAM(int sizeOfRAM);


    public abstract int getSizeOfHardDisk();

    public abstract void setSizeOfHardDisk(int sizeOfHardDisk);

    public static int getMaximumVmBuiltDaily() {
        return MAXIMUM_VM_BUILT_DAILY;
    }

    @Override
    public String toString() {
        return "VirtualMachine{ " + "hostname='" + hostname +
                ", requestorName='" + requestorName + '}';
    }
}
