'use strict'

let FirstLib = require('./FirstLib');

let SecondLib = {
  call(arg) {
    console.log("Calling the first lib!");

    FirstLib.call(arg);

    console.log("And that's just me: ", arg);
  }
}

module.exports = SecondLib;
