package wstepoop.homework.enums.zadanie2;

public enum PackageSize {

    SMALL(40,60),
    MEDIUM(80,120),
    LARGE(150,250),
    UNKNOWN(0,0);

    private int minimumSize, maximumSize;

    PackageSize(int minimumSize, int maximumSize) {
        this.minimumSize = minimumSize;
        this.maximumSize = maximumSize;
    }

    public static PackageSize getFittingPackageSize(int minSize, int maxSize){

        for(PackageSize packageSize : values()){
            if (canBeContainedIn(packageSize,minSize,maxSize)){
                return packageSize;
            }
        }

        return UNKNOWN;
    }

    private static boolean canBeContainedIn(PackageSize fitPackageSize, int minSize, int maxSize){
        return (minSize <= fitPackageSize.minimumSize && maxSize<= fitPackageSize.maximumSize);
    }

    public static int getMinimumPackageSize(PackageSize packageSize){
        return packageSize.minimumSize;
    }

    public static int getMaximumPackageSize(PackageSize packageSize){
        return packageSize.maximumSize;
    }
}
