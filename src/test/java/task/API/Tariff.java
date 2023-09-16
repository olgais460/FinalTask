package task.API;

public class Tariff {
    private Integer price;
    private String currency;
    private String name;
    private Integer ourTesterCount;
    private Integer theirTestsCount;



    public String getCurrency() {
        return currency;
    }

    public String getName() {
        return name;
    }

    public Integer getOurTesterCount() {
        return ourTesterCount;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getTheirTestsCount() {
        return theirTestsCount;
    }
}
