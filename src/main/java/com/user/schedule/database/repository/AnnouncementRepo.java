package com.user.schedule.database.repository;

import com.user.schedule.database.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepo extends JpaRepository<Announcement,Integer> {
}
