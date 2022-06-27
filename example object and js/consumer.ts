import { createInterface } from "readline";

let accMap = new Map<String, number>();

const rl = createInterface({
  input: process.stdin,
});

const handleLine = (input: String) => {
  const s = input.split(" ");
  if (s.length != 2) {
    console.log(input);
    return;
  }
  if (!accMap.has(s[0])) accMap.set(s[0], 0);
  accMap.set(s[0], accMap.get(s[0])! + +s[1]);
};

rl.on("line", handleLine);

rl.on("close", () => {
  console.log(accMap);
});
