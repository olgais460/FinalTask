package task.API;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.List;
// Метод GetAllTariffs
// /api/v2/tariff
import static io.restassured.RestAssured.given;


public class Start {
    private static final String URL= "https://dev-t.uxcrowd.ru/";
    private static final String CURRENCY="USD";
    @Test
    public void getAllTariffs() {
        Specification.InstallSpecification(Specification.requestSpec(URL),Specification.responseSpecOk200());
        List<Tariff> tariffs=given().
                when().
                get("api/v2/tariff").
                then().log().all().
              extract().body().jsonPath().getList(".",Tariff.class);
tariffs.forEach(x-> Assertions.assertTrue(x.getCurrency().contains(CURRENCY)));
    }
}
