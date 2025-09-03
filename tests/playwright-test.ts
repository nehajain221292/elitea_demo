import { test, expect } from '@playwright/test';

test('Verify Client Work text visibility on EPAM website', async ({ page }) => {
  // Navigate to the EPAM website
  await page.goto('https://www.epam.com/');

  // Select "Services" from the header menu
  await page.click('header >> text=Services');

  // Click the "Explore Our Client Work" link
  await page.click('text=Explore Our Client Work');

  // Verify that the "Client Work" text is visible on the page
  const clientWorkText = await page.locator('text=Client Work');
  await expect(clientWorkText).toBeVisible();
});