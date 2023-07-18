package com.ktds.duhyeon.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
@Service
public interface MainService {
    String getName(long memberId);
}
