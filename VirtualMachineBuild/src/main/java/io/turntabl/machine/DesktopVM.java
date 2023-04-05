package io.turntabl.machine;

public class DesktopVM extends VirtualMachine {

    private String windowVersion;
    private String buildNumber;

    public DesktopVM(String hostname, String requestorName, String windowVersion, String buildNumber) {
        super(hostname, requestorName);
        this.windowVersion = windowVersion;
        this.buildNumber = buildNumber;
    }


    @Override
    public long getNumberOfCPU() {
        return this.numberOfCPU;
    }

    @Override
    public void setNumberOfCPU(long numberOfCPU) {
        this.numberOfCPU = numberOfCPU;
    }

    @Override
    public int getSizeOfRAM() {
        return this.sizeOfRAM;
    }

    @Override
    public void setSizeOfRAM(int sizeOfRAM) {
        this.sizeOfRAM = sizeOfRAM;
    }

    @Override
    public int getSizeOfHardDisk() {
        return sizeOfHardDisk;
    }

    @Override
    public void setSizeOfHardDisk(int sizeOfHardDisk) {
        this.sizeOfHardDisk = sizeOfHardDisk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DesktopVM desktopVM = (DesktopVM) o;

        if (!windowVersion.equals(desktopVM.windowVersion)) return false;
        return buildNumber.equals(desktopVM.buildNumber);
    }

    @Override
    public int hashCode() {
        int result = windowVersion.hashCode();
        result = 31 * result + buildNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DesktopVM { windowVersion='" + windowVersion + '\'' +
                ", buildNumber='" + buildNumber + "}";
    }
}
