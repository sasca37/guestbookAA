package com.example.guestbooka.service;

import com.example.guestbooka.dto.GuestbookDTO;
import org.springframework.stereotype.Service;

public interface GuestbookService {
    Long register(GuestbookDTO dto);
}
