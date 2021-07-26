package com.example.guestbooka.service;

import com.example.guestbooka.dto.GuestbookDTO;
import com.example.guestbooka.entity.Guestbook;
import com.example.guestbooka.repository.GuestbookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class GuestbookServiceImpl implements GuestbookService{

    private final GuestbookRepository repository; //반드시 final로 선언

    @Override
    public Long register(GuestbookDTO dto) {
        log.info("DTO ------------------");
        log.info(dto);
        Guestbook entity = dtoToEntity(dto);
        log.info(entity);

        repository.save(entity);
        return entity.getGno();
    }
}
