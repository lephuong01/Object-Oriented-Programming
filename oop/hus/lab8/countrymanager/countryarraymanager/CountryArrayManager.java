package oop.hus.lab8.countrymanager.countryarraymanager;

import java.util.*;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */

        for (int i = 0; i < newArray.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[minIdx].getPopulation()) {
                    minIdx = j;
                }
            }
            Country tmp = newArray[minIdx];
            newArray[minIdx] = newArray[i];
            newArray[i] = tmp;

        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[minIdx].getPopulation()) {
                    minIdx = j;
                }
            }
            Country tmp = newArray[minIdx];
            newArray[minIdx] = newArray[i];
            newArray[i] = tmp;

        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country tmp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = tmp;
                }
            }
        }


        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country tmp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = tmp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }


        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * sing insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        int cnt = 0;
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                cnt++;
            }
        }
        int idx = 0;
        AfricaCountry[] africaCountries = new AfricaCountry[cnt];
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries[idx] = (AfricaCountry) country;
                idx++;
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        int cnt = 0;
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                cnt++;
            }
        }
        AsiaCountry[] asiaCountries = new AsiaCountry[cnt];
        int idx = 0;
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries[idx] = (AsiaCountry) country;
                idx++;
            }
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        int cnt = 0;
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                cnt++;
            }
        }
        EuropeCountry[] europeCountries = new EuropeCountry[cnt];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                europeCountries[index] = (EuropeCountry) country;
                index++;
            }
        }
        return europeCountries;

    }

    public NorthAmericaCountry filterNorthAmericaCountry() {
        /* TODO */

        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                return new NorthAmericaCountry(country.getCode(), country.getName(), country.getPopulation(), country.getArea(), country.getGdp());
            }
        }
        return null;
    }

    public OceaniaCountry filterOceaniaCountry() {
        /* TODO */
        for (int i = 0; i < this.length; i++) {
            if (this.countries[i] instanceof OceaniaCountry) {
                return (OceaniaCountry) this.countries[i];
            }
        }
        return null;
    }

    public SouthAmericaCountry filterSouthAmericaCountry() {
        /* TODO */
        for (int i = 0; i < this.length; i++) {
            if (this.countries[i] instanceof SouthAmericaCountry) {
                return (SouthAmericaCountry) this.countries[i];
            }
        }
        return null;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] mostPopulous = new Country[howMany];
        Country[] sortPopulous = sortByDecreasingPopulation();
        for (int i = 0; i < howMany; i++) {
            mostPopulous[i] = sortPopulous[i];
        }
        return mostPopulous;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] leastPopulous = new Country[howMany];
        Country[] sortPopulous = sortByIncreasingPopulation();
        for (int i = 0; i < howMany; i++) {
            leastPopulous[i] = sortPopulous[i];
        }
        return leastPopulous;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] largestArea = new Country[howMany];
        Country[] sortArea = sortByDecreasingArea();
        for (int i = 0; i < howMany; i++) {
            largestArea[i] = sortArea[i];
        }
        return largestArea;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] smalleastArea = new Country[howMany];
        Country[] sortArea = sortByIncreasingArea();
        for (int i = 0; i < howMany; i++) {
            smalleastArea[i] = sortArea[i];
        }
        return smalleastArea;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] highestGdp = new Country[howMany];
        Country[] sortGdp = sortByDecreasingGdp();
        for (int i = 0; i < howMany; i++) {
            highestGdp[i] = sortGdp[i];
        }
        return highestGdp;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] lowestGdp = new Country[howMany];
        Country[] sortGdp = sortByIncreasingGdp();
        for (int i = 0; i < howMany; i++) {
            lowestGdp[i] = sortGdp[i];
        }
        return lowestGdp;

    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
