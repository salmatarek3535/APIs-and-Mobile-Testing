package apiTestPackage;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.ProxySpecification;
import models.Authorization;
import models.TokenResponse;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.matchesPattern;

public class ApiTests {

    @Test
    public void getWSO2Token()
    {

        String endPoint= "https://m2mlit4id.vodafone.com/oauth2/token";
        String username= "solutionhubwso2+admin@gmail.com";
        String password= "rF8sd38ftdgA$";
        String authorization= "Basic Zk54dWdwUjBWbmZOOG94VDhpekZBUEdNMnp3YTo5cVFIZmtVSFozSkdSX1g1MFFPNndDQXJHR1Vh";
        ProxySpecification proxySpecification= new ProxySpecification("proxy01.vodafone-is.de",8080,"http");
        ValidatableResponse response = given().header("Authorization",authorization).
                proxy(proxySpecification).
                header("Content-Type", "application/x-www-form-urlencoded").
                queryParam("grant_type", "password").
                queryParam("username",username).
                queryParam("password",password).
                queryParam("scope","openid").
                when().post(endPoint).then().
                log().
                headers().
                assertThat().
                header("Content-Type", equalTo("application/json")).
                statusCode(200).
                body("scope",equalTo("openid"));


        response.log().body();


        //String accessToken= response.jsonPath().getString("access_token");
        //System.out.println(accessToken);

    }

    //this test won't work as we aren't sending json body , we are using content-type "application/x-www-form-urlencoded"
    @Test
    public void getWSO2Token_Serialization()
    {
        String endPoint= "https://m2mlit4id.vodafone.com/oauth2/token";
        String username= "solutionhubwso2+admin@gmail.com";
        String password= "rF8sd38ftdgA$";
        Authorization authorization_body= new Authorization("password",username,password,"openid");
        String authorization= "Basic Zk54dWdwUjBWbmZOOG94VDhpekZBUEdNMnp3YTo5cVFIZmtVSFozSkdSX1g1MFFPNndDQXJHR1Vh";
        ProxySpecification proxySpecification= new ProxySpecification("proxy01.vodafone-is.de",8080,"http");
        ValidatableResponse response = given().header("Authorization",authorization).
                proxy(proxySpecification).
                header("Content-Type", "application/x-www-form-urlencoded").
                body(authorization_body).
                when().post(endPoint).then();

        response.log().body();


        //String accessToken= response.jsonPath().getString("access_token");
        //System.out.println(accessToken);
    }

    //get the response body as an object (Deserialization)
    @Test
    public void getDeserializedWSO2Token()
    {

        String endPoint= "https://m2mlit4id.vodafone.com/oauth2/token";
        String username= "solutionhubwso2+admin@gmail.com";
        String password= "rF8sd38ftdgA$";
        String authorization= "Basic Zk54dWdwUjBWbmZOOG94VDhpekZBUEdNMnp3YTo5cVFIZmtVSFozSkdSX1g1MFFPNndDQXJHR1Vh";
        ProxySpecification proxySpecification= new ProxySpecification("proxy01.vodafone-is.de",8080,"http");
        TokenResponse response = given().header("Authorization",authorization).
                proxy(proxySpecification).
                header("Content-Type", "application/x-www-form-urlencoded").
                queryParam("grant_type", "password").
                queryParam("username",username).
                queryParam("password",password).
                queryParam("scope","openid").
                when().post(endPoint).
                as(TokenResponse.class);
        System.out.println(response.getAccess_token());
        Assert.assertThat(response.getScope(), equalTo("openid"));

        //response.log().body();


        //String accessToken= response.jsonPath().getString("access_token");
        //System.out.println(accessToken);

    }



}
