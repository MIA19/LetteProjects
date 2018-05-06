package de.lette.task.lambda;

import java.io.FileReader;
import java.util.*;

import de.lette.Utils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Address {

    private String street;
    private int postcode;
    private String state;

    /**
     *
     *
     * @param street
     * @param postcode
     * @param state
     */
    public Address(String street, int postcode, String state) {
        super();
        this.street = street;
        this.postcode = postcode;
        this.state = state;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @return the postcode
     */
    public int getPostcode() {
        return postcode;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Address [street=" + street + ", plz=" + postcode + ", state=" + state + "]";
    }


    public static void main(String[] args) throws Exception {
        ArrayList<Address> addressList = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();
        Object jsonAddressFile = jsonParser.parse(new FileReader(Utils.getInstance().getFile("addresses-us-100.json")));
        JSONObject jsonObjectFile = (JSONObject) jsonAddressFile;

        //String city = (String) jsonObject.get("city");

        // loop array

        JSONArray adressArr = (JSONArray) jsonObjectFile.get("addresses");
        adressArr.forEach(o -> {
            JSONObject jO = (JSONObject) o;
            addressList.add(new Address(String.valueOf(jO.get("address1")), Integer.parseInt(String.valueOf(jO.get("postalCode"))), String.valueOf(jO.get("state"))));
        });
        System.out.println(addressList);


        //addressList.stream().filter(a -> a.getPostcode() > 10000 && a.getPostcode() < 20000).forEach(System.out::println);
        addressList.stream().sorted(Comparator.comparing(Address::getPostcode).thenComparing(Address::getState)).forEach(System.out::println);
    }


}
