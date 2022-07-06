package com.kelp.kelpbackend; 

import org.springframework.data.jpa.repository.JpaRepository;

interface LocationRepository extends JpaRepository <Location, Long> {
}