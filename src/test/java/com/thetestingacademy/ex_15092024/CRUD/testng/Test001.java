package com.thetestingacademy.ex_15092024.CRUD.testng;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test001 {

    @Test
    public void test_get() {

        RestAssured
                .given().relaxedHTTPSValidation()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560037")
                .when()
                .log().all().get().
                then()
                .log().all().statusCode(200);

    }

    public static class BuilderPatternDesignPatternJava {
        // Change return type of each method as Class type
        // "this" always points to current/calling object. Returning the same to
        // have same reference

        public BuilderPatternDesignPatternJava Floor1() {
            System.out.println("Stag 1 is Done");
            return this;
        }

        public BuilderPatternDesignPatternJava Floor2(String parm) {
            System.out.println("Stag 2 is Done");
            return this;
        }

        public BuilderPatternDesignPatternJava Floor3() {
            System.out.println("Stag 3 is Done");
            return this;
        }

        public static void main(String[] args) {
            BuilderPatternDesignPatternJava bp = new BuilderPatternDesignPatternJava();
            bp.Floor1().Floor2("pramod").Floor3();

        }
    }
}