package net.primepro.primepro.service;

import net.primepro.primepro.dto.*;
import net.primepro.primepro.entity.Booking;
import net.primepro.primepro.entity.CenterAdmin;
import net.primepro.primepro.entity.Employee;
import net.primepro.primepro.entity.LeaveRequest;
import net.primepro.primepro.response.BookingResponse;
import net.primepro.primepro.response.LoginResponse;

import java.sql.Time;
import java.util.List;

public interface CenterAdminService {


    LoginResponse loginCenterAdmin(LoginDto loginDto);

    CenterAdminDto addCenterAdmin(CenterAdminDto centerAdminDto);
    void deleteCenterAdmin(Integer centeradminId);
    CenterAdminDto editCenterAdmin(CenterAdminDto centerAdminDto);
    List<CenterAdmin> viewAll();

//    List<Booking> getTodayBookings();
    List<BookingResponse> getTodayAllBookings();

    List<EmployeeDto> getAllEmployees();

    EmployeeDto getEmployeeDetails(String employeeId);

    List<?> getWorkLoadProgress();

    String assignTasks(TaskDto taskDto);

    String getCenter(int centerId);

    List<Booking> getBookings();

    // New development
//    List<Booking> getBookingsWithoutTimeAllocation();
    Booking allocateTime(Integer bookingId, Time time);
    Booking cantAllocateTime(Integer bookingId);
//    List<Booking> getBookingsWithoutTaskAssigned();
    List<Booking> getAllBookings();

    List<EmpPerformDto> getEmployeePerform();

    List<TaskDisDto> getTaskDistribution();
}
