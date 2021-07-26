package com.example.guestbooka.service;

import com.example.guestbooka.dto.GuestbookDTO;
import com.example.guestbooka.entity.Guestbook;
import org.springframework.stereotype.Service;

public interface GuestbookService {
    Long register(GuestbookDTO dto);

    default Guestbook dtoToEntity(GuestbookDTO dto) {
        Guestbook entity = Guestbook.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();
        return entity;
    }
}
