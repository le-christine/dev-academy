function buildContor(i) {
    let contor = 1;
    // this is a closure
    // these two functions work as a unit
    let displayContor = function () {
      console.log(contor++);
      contor++;
    };

    return displayContor;
}

let myContor = buildContor(1);
myContor();
myContor();
myContor();

let otherContor = buildContor(10);
otherContor();
otherContor();
otherContor();
