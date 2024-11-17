const api = (url, method, param, responseCallback) => {
    fetch(url, {
        method: method,
        headers: {
            'Content-type': 'application/json'
        },
        body: JSON.stringify(param)
    })
        .then(response => {
            if (response.ok) {
                console.log('.... ', response);
                responseCallback();
            } else {
                throw new Error('Failed');
            }
        })
        .then(data => {
            console.log('Successfully', data);
        })
};

