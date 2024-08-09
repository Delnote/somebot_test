package service;

import entities.requestEntity.RequestEntity;
import entities.responseEntity.ResponseEntity;

import java.util.List;

import static io.restassured.RestAssured.given;
import static java.util.Arrays.stream;

public class RestService {
    public static List<ResponseEntity> postBrigadeRequest(RequestEntity requestEntity) {
        return postRequest("/testing/brigade", requestEntity);
    }

    public static List<ResponseEntity> postAdminRequest(RequestEntity requestEntity) {
        return postRequest("/testing/admin", requestEntity);
    }

    public static List<ResponseEntity> postManagerRequest(RequestEntity requestEntity) {
        return postRequest("/testing/manager", requestEntity);
    }

    public static List<ResponseEntity> postSupportRequest(RequestEntity requestEntity) {
        return postRequest("/testing/support", requestEntity);
    }

    public static List<ResponseEntity> postRequest(String path, RequestEntity requestEntity) {
        return stream(given()
//                .baseUri("http://localhost:8086")
                .port(8086)
                .body(requestEntity)
                .contentType("application/json")
                .post(path)
                .then()
                .statusCode(200)
                .extract()
                .as(ResponseEntity[].class))
                .toList();
    }
}
