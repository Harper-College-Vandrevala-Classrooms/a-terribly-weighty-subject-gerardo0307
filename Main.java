function toPounds(ounces) {
    if (ounces < 0) return "Invalid number, cannot be negative.";
    const pounds = (ounces / 16).toFixed(4);
    return pounds === "1.0000" ? "one lb" : `${pounds} lbs`;
}


function toPoundsAndOunces(ounces) {
    if (ounces < 0) return "Invalid number, cannot be negative.";
    const pounds = Math.floor(ounces / 16);
    const remainingOunces = ounces % 16;
    const poundStr = pounds === 0 ? "" : (pounds === 1 ? "one lb" : `${pounds} lbs`);
    const ounceStr = remainingOunces === 0 ? "" : (remainingOunces === 1 ? "one oz" : `${remainingOunces} oz`);

    if (poundStr && ounceStr) {
        return `${poundStr} and ${ounceStr}`;
    }
    return poundStr || ounceStr || "0 oz";