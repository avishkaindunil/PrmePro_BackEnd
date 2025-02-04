package net.primepro.primepro.repository;

import net.primepro.primepro.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingRepo extends JpaRepository<Booking,Integer> {
    @Query(
            value =
                    "SELECT bk.booking_id, bk.center_name, bk.userid , bk.date, bk.car_name, bk.service, tk.customer_id, tk.task_description,  \n" +
                            "tk.task_date, tk.start_time, tk.end_time, tk.task_status, em.employee_id FROM booking bk JOIN task tk ON bk.booking_id = tk.booking_id \n" +
                            "JOIN employee em ON tk.employee_id = em.id",
            nativeQuery = true)
    List<Object[]> getBookingsDetails();

    @Modifying
    @Query(value = "UPDATE booking SET is_task_assigned = ? where booking_id = ?", nativeQuery = true)
    void updateTaskStatus(boolean b, int bookingId);
}
