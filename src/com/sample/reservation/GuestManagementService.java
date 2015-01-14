package com.sample.reservation;

import java.util.*;
import com.sample.reservation.dto.*;

public class GuestManagementService {
    
    private static Map<String, Guest> guests = new HashMap<>();
    
    public boolean addGuest(String name, String address, int age){
        guests.put(name, new Guest(name, address, age));
        return true;
    }

    public Guest getGuestDetails(String name){
        return guests.get(name);
    }
    
    public void deleteGuest(String guestName){
        // not implemented yet
    }
}

