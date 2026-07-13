import { useState } from "react";

function CurrencyConvertor() {

    const [amount, setAmount] = useState("");
    const [currency, setCurrency] = useState("");

    const handleSubmit = (event) => {

        event.preventDefault();

        const euro = amount / 90;

        alert("Converting to Euro amount is " + euro.toFixed(2));
    };

    return (

        <div>

            <h2 style={{ color: "green" }}>
                Currency Convertor!!!
            </h2>

            <form onSubmit={handleSubmit}>

                <label>Amount:</label>

                <input
                    type="number"
                    value={amount}
                    onChange={(e) => setAmount(e.target.value)}
                />

                <br /><br />

                <label>Currency:</label>

                <input
                    type="text"
                    value={currency}
                    onChange={(e) => setCurrency(e.target.value)}
                />

                <br /><br />

                <button type="submit">
                    Submit
                </button>

            </form>

        </div>

    );
}

export default CurrencyConvertor;