//package com.learnKafka.controller;
//
//import com.learnKafka.domain.LibraryEvent;
//import com.learnKafka.util.TestUtil;
//import org.junit.jupiter.api.Test;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class LibraryEventsControllerIntegrationTest {
//
//    @Autowired
//    TestRestTemplate restTemplate;
//
//    @Test
//    void postLibraryEvent() {
//        //given
//        LibraryEvent libraryEvent = TestUtil.libraryEventRecord();
//        System.out.println("libraryEvent : " + objectMapper.writeValueAsString(libraryEvent));
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("content-type", MediaType.APPLICATION_JSON.toString());
//        HttpEntity<LibraryEvent> request = new HttpEntity<>(libraryEvent, headers);
//
//        //when
//        ResponseEntity<LibraryEvent> responseEntity = restTemplate.exchange("/v1/libraryevent", HttpMethod.POST, request, LibraryEvent.class);
//
//        //then
//        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
//    }
//
//}