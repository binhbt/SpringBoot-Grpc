package com.example.grpc.server.grpcserver;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestRestController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    @ResponseBody
	public String echo() {
		return "Hello. im Rest api!";
	}
}
