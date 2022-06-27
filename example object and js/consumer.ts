import { createInterface } from "readline";

const accMap = new Map<string, number>();
const rl = createInterface({ input: process.stdin });

function handleLine(input: string): void {
  const s = input.split(" ");
  accMap.set(s[0], accMap.get(s[0]) ?? 0 + Number(s[1]));
}

rl.on("line", handleLine);
rl.on("close", () => console.log(accMap));
