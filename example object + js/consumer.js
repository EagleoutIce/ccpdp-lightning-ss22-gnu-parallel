"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const readline_1 = require("readline");
let accMap = new Map();
const rl = (0, readline_1.createInterface)({
    input: process.stdin,
});
rl.on("line", (input) => {
    handleLine(input);
});
rl.on("close", () => {
    console.log(accMap);
});
const handleLine = (input) => {
    const s = input.split(" ");
    if (s.length != 2) {
        console.log(input);
        return;
    }
    if (!accMap.has(s[0]))
        accMap.set(s[0], 0);
    accMap.set(s[0], accMap.get(s[0]) + +s[1]);
};
