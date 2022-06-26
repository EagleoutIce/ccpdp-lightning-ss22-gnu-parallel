const args = process.argv.slice(2);

interface accInterface {
  [index: string]: number;
}

let acc = {} as accInterface;

for (let i = 0; i < args.length; i++) {
  if (!acc[args[i]]) acc[args[i]] = 0;
  acc[args[i]] = acc[args[i]] + +args[i + 1];
  i++;
}

for (const x in acc) {
  console.log(x, acc[x]);
}

//console.log(acc);
