package com.sda.zaawansowane.wstepoop.homework.enums.zadanie2;

public class PackageTestMain {

    public static void main(String[] args) {

        System.out.println("30x60 can be contained in " + PackageSize.getFittingPackageSize(30,60));
        System.out.println("80x90 can be contained in " + PackageSize.getFittingPackageSize(80,90));
        System.out.println("30x220 can be contained in " + PackageSize.getFittingPackageSize(30,220));
        System.out.println("300x800 can be contained in " + PackageSize.getFittingPackageSize(300,800));

        System.out.println(PackageSize.SMALL + ":");
        System.out.println(PackageSize.getMinimumPackageSize(PackageSize.SMALL));
        System.out.println(PackageSize.getMaximumPackageSize(PackageSize.SMALL));

        System.out.println(PackageSize.MEDIUM + ":");
        System.out.println(PackageSize.getMinimumPackageSize(PackageSize.MEDIUM));
        System.out.println(PackageSize.getMaximumPackageSize(PackageSize.MEDIUM));

        System.out.println(PackageSize.LARGE + ":");
        System.out.println(PackageSize.getMinimumPackageSize(PackageSize.LARGE));
        System.out.println(PackageSize.getMaximumPackageSize(PackageSize.LARGE));

    }

}
