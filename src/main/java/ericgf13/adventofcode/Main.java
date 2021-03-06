package ericgf13.adventofcode;

import ericgf13.adventofcode.days.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Day> days = new ArrayList<>();
        days.add(new Day01());
        days.add(new Day02());
        days.add(new Day03());
        days.add(new Day04());
        days.add(new Day05());
        days.add(new Day06());
        days.add(new Day07());
        days.add(new Day08());
        days.add(new Day09());
        days.add(new Day10());
        days.add(new Day11());
        days.add(new Day12());
        days.add(new Day13());
        days.add(new Day14());
        days.add(new Day15());
        days.add(new Day16());
        days.add(new Day17());
        days.add(new Day18());
        days.add(new Day19());
        days.add(new Day20());
        days.add(new Day22());
        days.add(new Day23());
        days.add(new Day24());
        days.add(new Day25());

        days.forEach(day -> {
            System.out.println("===== DAY " + day.getDayNum() + " =====");
            System.out.println("Part 1: " + day.part1());
            System.out.println("Part 2: " + day.part2());
        });
    }
}
