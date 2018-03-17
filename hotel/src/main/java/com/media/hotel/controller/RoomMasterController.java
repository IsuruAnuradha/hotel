package com.media.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.media.hotel.model.RoomMaster;
import com.media.hotel.services.RoomMasterService;

@RestController
@RequestMapping("/roommaster")
public class RoomMasterController {

	@Autowired
	private RoomMasterService roommasterservice;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public RoomMaster saveRoomMaster(@RequestBody RoomMaster roommaster) {

		return roommasterservice.saveRoomMaster(roommaster);
	}

}
