package pl.dmichalski.crm.web.presentation.contact_time_line.boudary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dmichalski.crm.core.business.contact_timeline.control.ContactTimelineRepository;
import pl.dmichalski.crm.core.business.contact_timeline.entity.ContactTimeline;

import java.util.List;

@RestController
@RequestMapping("/api/contact-timelines")
public class ContactTimeLineController {

    private ContactTimelineRepository contactTimelineRepository;

    @Autowired
    public ContactTimeLineController(ContactTimelineRepository contactTimelineRepository) {
        this.contactTimelineRepository = contactTimelineRepository;
    }

    @RequestMapping
    public List<ContactTimeline> findAllContactTimeLines() {
        return contactTimelineRepository.findAll();
    }

}
