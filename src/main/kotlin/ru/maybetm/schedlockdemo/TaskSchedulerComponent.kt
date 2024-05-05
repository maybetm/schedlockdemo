package ru.maybetm.schedlockdemo

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component


@Component
class TaskSchedulerComponent {

    private val logger: Logger = LoggerFactory.getLogger(this.javaClass)

    @Scheduled(fixedDelay = 10_000)
    @SchedulerLock(name = "printLogTastExample")
    fun scheduledTask() {
        logger.info("task is running")
    }
}