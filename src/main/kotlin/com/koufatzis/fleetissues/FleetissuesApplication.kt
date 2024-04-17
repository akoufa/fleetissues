package com.koufatzis.fleetissues

import com.koufatzis.gen.fleet.Fleet
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FleetissuesApplication

fun main(args: Array<String>) {
	// This is the generated class from the Avro file
	Fleet()
	runApplication<FleetissuesApplication>(*args)
}
