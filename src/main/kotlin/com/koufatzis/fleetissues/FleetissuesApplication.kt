package com.koufatzis.fleetissues

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FleetissuesApplication

fun main(args: Array<String>) {
	runApplication<FleetissuesApplication>(*args)
}

fun someBigMethod(): Int {
	val x = 10
	val y = 100
	val z = y + x

	return z
}
