import { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {

  const [count, setCount] = useState(0);

  // Increment Counter
  const increment = () => {
    setCount(count + 1);
  };

  // Decrement Counter
  const decrement = () => {
    setCount(count - 1);
  };

  // Say Hello
  const sayHello = () => {
    alert("Hello! This is a static message.");
  };

  // Multiple Methods
  const handleIncrement = () => {
    increment();
    sayHello();
  };

  // Welcome
  const sayWelcome = (msg) => {
    alert(msg);
  };

  // Synthetic Event
  const handlePress = () => {
    alert("I was clicked");
  };

  return (

      <div style={{ margin: "20px" }}>

        <h2>Counter : {count}</h2>

        <button onClick={handleIncrement}>
          Increment
        </button>

        <button onClick={decrement}>
          Decrement
        </button>

        <br /><br />

        <button onClick={() => sayWelcome("Welcome")}>
          Say Welcome
        </button>

        <br /><br />

        <button onClick={handlePress}>
          Click on me
        </button>

        <hr />

        <CurrencyConvertor />

      </div>

  );
}

export default App;