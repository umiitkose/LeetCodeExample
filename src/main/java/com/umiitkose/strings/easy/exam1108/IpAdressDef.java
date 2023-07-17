package com.umiitkose.strings.easy.exam1108;


/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 * <p>
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The given address is a valid IPv4 address.
 */
public class IpAdressDef {
    private static final String IPV4_PATTERN_ALLOW_LEADING_ZERO =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args) {
        IpAdressDef main = new IpAdressDef();
        String ipAdress = main.defangIPaddr("255.100.50.0");
        if ("".equals(ipAdress)) {
            System.out.println("İp Adresi Değildir.");
        } else {
            System.out.println("def Ip Address : " + ipAdress);

        }
    }

    public String defangIPaddr(String address) {

        if (address.matches(IPV4_PATTERN_ALLOW_LEADING_ZERO)) {
            address = address.replaceAll("\\.", "[.]");

        }
        return address;
    }


}
