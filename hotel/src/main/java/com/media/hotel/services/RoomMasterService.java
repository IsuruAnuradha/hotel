package com.media.hotel.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.media.hotel.model.RoomMaster;
import com.media.hotel.repository.RoomMasterRepository;

public class RoomMasterService {

	@Autowired
	private RoomMasterRepository roommasterrepository;

	public RoomMaster saveRoomMaster(RoomMaster roommaster) {

		return roommasterrepository.save(roommaster);

	}

}
