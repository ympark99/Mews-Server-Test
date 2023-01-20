package com.mews.mews_backend.domain.calendar.repository;

import com.mews.mews_backend.domain.calendar.entity.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
@EnableJpaRepositories
public interface CalendarRepository extends JpaRepository<Calendar, Integer> {

    // 특정 달에 해당하는 일정들 불러오기
    List<Calendar> findAllByDateBetween(LocalDate startDate, LocalDate endDate);

    // 특정 일자에 해당하는 일정들 불러오기
    List<Calendar> findAllByDate(LocalDate date);

    // 특정 일정 하나 불러오기
    Calendar findOneById(Integer id);
}
